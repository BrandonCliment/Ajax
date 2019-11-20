/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pedago
 */
public class CodeEntity {
    
    private String code;
    private float rate ;

    public CodeEntity(String code, float tx){
        this.code=code;
        this.rate=tx;
    }
    public String getDiscount_code() {
        return code;
    }

    public void setDiscount_code(String code) {
        this.code = code;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
    
}

