package org.simon.pascal.domains;

import lombok.Data;

/**
 * Created by SimonPascal on 05/13/2016.
 */
@Data
public class CalcInput {
    private int a;
    private int b;

    public int sum(){
        return a+b;
    }
}
