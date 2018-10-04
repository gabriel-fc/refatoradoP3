package com.company.view.messagesPackage;

public class LoginDefaultMessages {
    public void enterUserMessage(){
        System.out.print("Digite o login de administrador:\n");
    }

    public void wrongPasswordMessage(int chancesLeft){
    System.out.printf("Senha incorreta. Você tem %d tentativas restantes!\n", chancesLeft);
    }

    public void wrongUserMessage(int chancesLeft){
        System.out.printf("Usuário incorreto. Você tem %d tentativas restantes!\n", chancesLeft);
    }

    public void enterPasswordMessage(){
        System.out.print("Digite a senha:\n");
    }

    public void setLoginMessage(){
        System.out.println("Insira os dados de login:");
    }
}
