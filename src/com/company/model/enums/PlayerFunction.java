package com.company.model.enums;

public enum PlayerFunction {
GOALKEEPER("Goleiro", 1), LEFT_WINGER("Lateral esquerdo", 2), DEFENDER("Zagueiro", 3), RIGHT_WINGER("Lateral direito", 4),CENTRAL_DEFENDER("Volante", 5), MID_FIELDER("Meia", 6), STRIKER("Atacante", 7);

    public final String to_portuguese;
    public final int value;

    PlayerFunction(String to_portuguese, int value){
        this.to_portuguese = to_portuguese;
        this.value = value;
    }

    public static String getKey(int value){
        for (PlayerFunction function: PlayerFunction.values()) {
            if (value == function.value){
                return function.to_portuguese;
            }
        }
        return null;
    }
}
