
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exerciolojaa.Endereco;
import exerciolojaa.Produto;
import exerciolojaa.Venda;
import exerciolojaa.Cliente;

import java.util.Random;

public class Loja {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<Cliente> clientes = new HashSet<>();
        Set<Produto> produtos = new HashSet<>();

        int opcao = 0;
        while(opcao >= 0) {
            System.out.println("--------------------------------------");
            System.out.println(" -Selecione a opcao desejada: ");
            System.out.println("1 - Cadastrar cliente.");
            System.out.println("2 - Listar Clientes.");
            System.out.println("3 - Cadastrar Produto.");
            System.out.println("4 - Listar Produtos.");
            System.out.println("5 - Ativar/Desativar Inadinplencia.");
            System.out.println("6 - Excluir Produtos.");
            System.out.println("7 - Editar Clientes.");
            System.out.println("8 - Editar Produtos.");
            System.out.println("9 - Realizar Venda");
            System.out.println("10 - Listar Vendas.");
            System.out.println("11 - Sair do Programa.");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe o nome: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("Informe o CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.println("informe a rua: ");
                    String rua = scanner.nextLine();
                    System.out.println("Informe o numero da casa: ");
                    int numero = Integer.parseInt(scanner.next());
                    System.out.println("Informe o bairro: ");
                    scanner.nextLine();
                    String bairro = scanner.nextLine();
                    System.out.println("Informe sua Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.println("Informe o CEP: ");
                    String cep = scanner.nextLine();
                    System.out.println("Informe a data de nascimento");
                    String dtnascimento = scanner.nextLine();
                    System.out.println("CADASTRO EFETUADO COM SUCESSO!");
                    Boolean inadinp = false;
                    Endereco endereco = new Endereco(rua,numero,bairro,cidade,cep);
                    Cliente clientee = new Cliente(nome,cpf,endereco,dtnascimento,inadinp);
                    clientes.add(clientee);
                break;
                case 2:
                    for (Cliente cliente : clientes ){
                        Cliente clientList =  cliente;
                        System.out.println("Nome: " + clientList.getNome());
                        System.out.println("Cpf: " + clientList.getCpf());
                        System.out.println("Rua: " + clientList.getEndereco().getRua());
                        System.out.println("Bairro: " + clientList.getEndereco().getBairro());
                        System.out.println("Cidade: " + clientList.getEndereco().getCidade());
                        System.out.println("CEP: " + clientList.getEndereco().getCep());
                        System.out.println("Data de Nascimento: " + clientList.getDtnascimento());
                        System.out.println("--------------------------------------");
                }
                break;
                case 3:
                    System.out.println("Informe a descrição do produto: ");
                    scanner.nextLine();
                    String descricao = scanner.nextLine();
                    System.out.println("Informe a categoria: ");
                    String categoria = scanner.nextLine();
                    Random gerador = new Random();
                    int cod = gerador.nextInt(999);
                    Produto produtoo = new Produto(cod,descricao,categoria);
                    produtos.add(produtoo);
                break;
                case 4:
                    for ( Produto produto : produtos ){
                        Produto produtolist = produto;
                        System.out.println("Codigo do Produto: " + produtolist.getCod());
                        System.out.println("Descrição: " + produtolist.getDescricao());
                        System.out.println("Categoria: " + produtolist.getCategoria());
                        System.out.println("-----------------------");
                }
                break;
                case 5:
                //Fazer um while pra se o cpf for invalido pedir o CPF novamente.
                    System.out.println("Digite o CPF do cliente que quer deixar inadinplente: ");
                    String cpfInadinp = scanner.next();
                    for (Cliente cliente : clientes){
                        Cliente clienteInadinp = cliente;
                        if(clienteInadinp.getCpf().equals(cpfInadinp)){
                            clienteInadinp.setInadimp(!clienteInadinp.isInadimp());                        
                            System.out.println("Cliente: " + clienteInadinp.getNome());
                            System.out.println("Portador do CPF: " + clienteInadinp.getCpf());
                            if(clienteInadinp.isInadimp() == true)
                            System.out.println("Está INADINPLENTE!");
                            else if(clienteInadinp.isInadimp() == false)
                            System.out.println("Está com a situação REGULAR");
                            else
                            System.out.println("CPF INVALIDO");
                    }
                }              
                break;
                case 6:
                System.out.println("Informe o COD do produto que deseja REMOVER: ");
                    int produtoRemove = scanner.nextInt();
                    Produto produto2 = null;
                for (Produto produto : produtos){                    
                    if(produtoRemove == produto.getCod()){
                        produto2 = produto;
                        produtos.remove(produto2);
                        System.out.println("Produto: " + produto.getCod() + " REMOVIDO!");                        
                    }                     
                }
                break;
                case 7:
                System.out.println("Qual CPF do cliente que deseja editar: ");
                String cpfEdit = scanner.next();
                for (Cliente cliente : clientes ){
                    Cliente clienteEdit = cliente;
                    if(clienteEdit.getCpf().equals(cpfEdit));{
                    System.out.println("Digite a opção que deseja editar no Cliente: " + clienteEdit.getNome());
                    System.out.println("1 - Editar nome: ");
                    System.out.println("2 - Editar CPF: ");
                    System.out.println("3 - Editar rua: ");
                    System.out.println("4 - Editar numero: ");
                    System.out.println("5 - Editar bairro: ");
                    System.out.println("6 - Editar Cidade: ");
                    System.out.println("7 - Editar Cep: ");
                    System.out.println("8 -Editar data de nascimento: ");
            
                    int opcao2 = scanner.nextInt();
                    switch (opcao2){
                        case 1:
                        System.out.println("Você está alterando o nome: " + clienteEdit.getNome());
                        System.out.println("Informe o nome alterado: ");
                        scanner.nextLine();
                        String nomeModific = scanner.nextLine();
                        clienteEdit.setNome(nomeModific);
                        System.out.println("Nome Alterado com SUCESSO!");
                        break;
                        case 2:
                        System.out.println("Você está alterando o CPF: " + clienteEdit.getCpf());
                        System.out.println("Informe o CPF alterado: ");
                        scanner.nextLine();
                        String cpfModific = scanner.nextLine();
                        clienteEdit.setCpf(cpfModific);
                        System.out.println("CPF alterado com SUCESSO");
                        break;
                        case 3:
                        System.out.println("Você está alterando a rua: " + clienteEdit.getEndereco().getRua());
                        System.out.println("Informe a rua alterada: ");
                        scanner.nextLine();
                        String ruaModific = scanner.nextLine();
                        clienteEdit.getEndereco().setRua(ruaModific);
                        System.out.println("Rua alterada com Sucesso!");
                        break;
                        case 4:
                        System.out.println("Você está alterando o numero: " + clienteEdit.getEndereco().getNumero());
                        System.out.println("Informe o numero alterada: ");
                        scanner.nextInt();
                        int numeroModific = scanner.nextInt();
                        clienteEdit.getEndereco().setNumero(numeroModific);
                        System.out.println("Numero alterada com Sucesso!");
                        break;
                        case 5:
                        System.out.println("Você está alterando o bairro: " + clienteEdit.getEndereco().getBairro());
                        System.out.println("Informe o bairro alterada: ");
                        scanner.nextLine();
                        String bairroModific = scanner.nextLine();
                        clienteEdit.getEndereco().setBairro(bairroModific);
                        System.out.println("Bairro Alterada com Sucesso!");
                        break;
                        case 6:
                        System.out.println("Você está alterando a cidade: " + clienteEdit.getEndereco().getCidade());
                        System.out.println("Informe a Cidade alterada: ");
                        scanner.nextLine();
                        String cidadeModific = scanner.nextLine();
                        clienteEdit.getEndereco().setCidade(cidadeModific);
                        System.out.println("Cidade alterada com Sucesso!");
                        break;
                        case 7:
                        System.out.println("Você está alterando o CEP: " + clienteEdit.getEndereco().getRua());
                        System.out.println("Informe o CEP alterado: ");
                        scanner.nextLine();
                        String cepModific = scanner.nextLine();
                        clienteEdit.getEndereco().setCep(cepModific);
                        System.out.println("CEP alterado com Sucesso!");
                        break;
                        case 8:
                        System.out.println("Você está alterando a data de nascimento: " + clienteEdit.getDtnascimento());
                        System.out.println("Informe a data de nascimento alterada: ");
                        scanner.nextLine();
                        String nascimentoModific = scanner.nextLine();
                        clienteEdit.setDtnascimento(nascimentoModific);
                        System.out.println("Rua Alterada com Sucesso!");
                        break;
                        default:
                        System.out.println("Opção invalida");
                    }
                    break;
                }
                } 
                break;
                case 11:
                opcao = -1;
                break;
                default:
                System.out.println("Opção invalida!");
                case 8:
                System.out.println("Digite o código do produto que deseja editar: ");
                int codigoProduto = scanner.nextInt();
                Produto produtoParaEditar = null;
                for (Produto produto : produtos) {
                    if (produto.getCod() == codigoProduto) {
                        produtoParaEditar = produto;
                        break;
                    }
                }
                if (produtoParaEditar == null) {
                    System.out.println("O produto com o código " + codigoProduto + " não foi encontrado.");
                } else {
                    System.out.println("O produto selecionado é:");
                    System.out.println("Código: " + produtoParaEditar.getCod());
                    System.out.println("Descrição: " + produtoParaEditar.getDescricao());
                    System.out.println("Categoria: " + produtoParaEditar.getCategoria());

                    System.out.println("Digite a nova descrição do produto:");
                    scanner.nextLine();
                    String novaDescricao = scanner.nextLine();
                    produtoParaEditar.setDescricao(novaDescricao);

                    System.out.println("Digite a nova categoria do produto:");
                    String novaCategoria = scanner.nextLine();
                    produtoParaEditar.setCategoria(novaCategoria);

                    System.out.println("Produto atualizado com sucesso.");
                }
                break;
                case 9:
                 System.out.println("Produtos disponíveis para venda:");
                 for (Produto produto : produtos) {
                     System.out.println(produto.getCod() + " - " + produto.getDescricao());
                 }
             
                 System.out.println("Informe o código do produto a ser vendido:");
                 int codProduto = scanner.nextInt();
             
                 // Busca pelo produto selecionado na lista de produtos cadastrados
                 Produto produtoSelecionado = null;
                 for (Produto produto : produtos) {
                     if (produto.getCod() == codProduto) {
                         produtoSelecionado = produto;
                         break;
                     }
                 }
             
                 if (produtoSelecionado == null) {
                     System.out.println("Produto não encontrado.");
                     break;
                 }
             
                 System.out.println("Clientes cadastrados:");
                 for (Cliente cliente : clientes) {
                     System.out.println(cliente.getCpf() + " - " + cliente.getNome());
                 }
             
                 System.out.println("Informe o CPF do cliente que está comprando:");
                 String cpfCliente = scanner.next();
             
                 // Busca pelo cliente selecionado na lista de clientes cadastrados
                 Cliente clienteSelecionado = null;
                 for (Cliente cliente : clientes) {
                     if (cliente.getCpf().equals(cpfCliente)) {
                         clienteSelecionado = cliente;
                         break;
                     }
                 }
             
                 if (clienteSelecionado == null) {
                     System.out.println("Cliente não encontrado.");
                     break;
                 }
             
                 // Cria uma nova venda e adiciona à lista de vendas do cliente
                 Venda venda = new Venda(clienteSelecionado, produtoSelecionado);
                 clienteSelecionado.adicionarVenda(venda);
                 System.out.println("Venda realizada com sucesso!");
                 break;
                 // VERIFICAR CASE 10.
                 case 10:
                 System.out.println("Listar vendas realizadas:");
                 System.out.println("Informe o CPF do cliente ou 'TODOS' para listar todas as vendas:");
                 String cpfvenda = scanner.next();
                        
                 if (cpfvenda.equals("TODOS")) {
                     // Listar todas as vendas realizadas
                     for (Cliente cliente : clientes) {
                         System.out.println("Vendas realizadas por " + cliente.getNome() + ":");
                         for (Venda vendacliente : cliente.getVendas()) {
                             System.out.println(vendacliente.getProduto().getDescricao() + " - " + vendacliente.getDataVenda());
                         }
                     }
                 } else {
                     // Listar as vendas realizadas pelo cliente especificado
                     Cliente clienteSelecionadovenda = null;
                     for (Cliente cliente : clientes) {
                         if (cliente.getCpf().equals(cpfvenda)) {
                             clienteSelecionadovenda = cliente;
                             break;
                         }
                     }
                     
                     if (clienteSelecionadovenda == null) {
                         System.out.println("Cliente não encontrado.");
                         break;
                     }
                     
                     System.out.println("Vendas realizadas por " + clienteSelecionadovenda.getNome() + ":");
                     for (Venda vendacliente : clienteSelecionadovenda.getVendas()) {
                        System.out.println(vendacliente.getProduto().getDescricao() + " - " + vendacliente.getDataVenda());
                     }
                 }
                 
                 break;
             

               
            }
        }
    }
}

    
  