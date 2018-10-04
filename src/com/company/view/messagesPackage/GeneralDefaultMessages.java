package com.company.view.messagesPackage;

public class GeneralDefaultMessages {


    public  void showMessage(String message){
        System.out.println(message);
    }

    public  void successfullOperation(){
        System.out.print("\nOperação realizada com sucesso!\n\n");
    }

    public  void canceledOperation(){
        System.out.print("\nOperação cancelada!\n\n");
    }

    public  void employeeNotfound(){
        System.out.print("Funcionário não cadastrado!\n\n");
    }

    public  void supporterNotfound(){
        System.out.print("\nSócio não cadastrado!\n\n");
    }

    public  void resourceNotfound(){
        System.out.print("\nRecurso não cadastrado!\n\n");
    }

    public  void regularEmployees(){
        System.out.print("\nFuncionários Administrativos:\n\n");
    }

    public  void team(){
        System.out.print("\nEquipe de futebol:\n\n");
    }

    public  String additionQuestion(){
        return "Deseja adiciona-lo?\n1." +
                "Sim\n2." +
                "Não\n";
    }

    public  void resources(){
        System.out.print("\nRecursos físicos:\n\n");
    }

    public  void welcome(){
        System.out.println("~~~~~~~~~~~~~~~~~~Bem-vindo ao Isoccer!~~~~~~~~~~~~~~~~~~");
    }

    public  void endOfProgramMessage(){
        System.out.print("\nAté logo!");
    }
}
