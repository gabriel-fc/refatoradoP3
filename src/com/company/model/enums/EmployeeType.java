package com.company.model.enums;

public enum EmployeeType {
    PRESIDENT("Presidente", 1), DOCTOR("Médico", 2), COACH("Técnico", 3), PHYSICAL_TRAINER("Preparador físico", 4),
    DRIVER("Motorista", 5), COOKER("Cozinheiro", 6), LAWYER("Advogado", 7), PLAYER("Jogador de futebol", 8);

    public final String to_portuguese;
    public final int value;

    EmployeeType(String to_portuguese, int value){
        this.to_portuguese = to_portuguese;
        this.value = value;
    }

    public static String getKey(int value){
        for (EmployeeType i : EmployeeType.values()) {
            if (i.value == value){
                return i.to_portuguese;
            }
        }
        return null;
    }
}