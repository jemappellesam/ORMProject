import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resposta=0;
        boolean execute = true;
      do{
          CRUD crud = new CRUD();
          System.out.println("----------------MENU----------------");
          System.out.println("Selecione uma opção: ");
          System.out.println("1) Cadastrar Mídia ");
          System.out.println("2) Consultar Mídia ");
          System.out.println("3) Atualizar Mídia ");
          System.out.println("4) Deletar Mídia ");
          System.out.println("5) Cadastrar gênero");
          System.out.println("6) Consultar gênero");
          System.out.println("7) Atualizar gênero");
          System.out.println("8) Deletar gênero");
          System.out.println("9) Cadastrar diretor");
          System.out.println("10) Consultar diretor");
          System.out.println("11) Excluir diretor");
          System.out.println("12) Atualizar diretor");
          System.out.println("13) Encerrar programa");
          System.out.println("----------------*----------------");
          switch (resposta){
              case 1:
                  System.out.println("Identificador da mídia: ");
                  int id = scan.nextInt();
                  System.out.println("Nome da mídia: ");
                  String nome = scan.nextLine();
                  System.out.println("ID do gênero: ");
                  int id_genero = scan.nextInt();
                  Genero g1 = crud.searchGenero(id_genero);
                  System.out.println("Ano de lançamento: ");
                  int ano = scan.nextInt();
                  System.out.println("Id do diretor: ");
                  int id_diretor = scan.nextInt();
                  Diretor d1 = crud.searchDiretor(id_diretor);
                  crud.addMidia(id,nome,g1,ano,d1);
          }


      }
      while (execute);


    }
}
