package com.company.view;

public class ToStringFunctions {


    public String toStringPlayerStatus(int playerStatus) {
        switch (playerStatus) {
            case 1:
                return "Apto";
            case 2:
                return "Não Apto";
            case 3:
                return "No Departamento Médico";
            default:
                return null;
        }
    }

    public String toStringSupporterCompliance(boolean compliance){
        if(compliance){
            return "Adimplente";
        }
        return "Inadimplente";
    }

    public String toStringSupporterCategory(int category) {
        switch (category) {
            case 1:
                return "Júnior";
            case 2:
                return "Sênior";
            case 3:
                return "Elite";
            default:
                return null;
        }
    }

    public String toStringResourceStatus(boolean status){
        if (status){
            return "Disponível";
        }
        return "Indisponível";
    }

    public String toStringResourceType(int type){
        switch (type){
            case 1:
                return "Ônibus";
            case 2:
                return "Estádio";
            case 3:
                return "Centro de treinamento";
            default:
                return null;
        }
    }

}
