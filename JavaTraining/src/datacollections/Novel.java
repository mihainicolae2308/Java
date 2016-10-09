/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacollections;

import logging.*;

/**
 *
 * @author mnicolae
 */
public class Novel extends Book {
    public enum TypeOfNovel { SF, ROMANCE, MYSTERY }
    private TypeOfNovel novelType;

    public TypeOfNovel getNovelType() {
        return novelType;
    }

    public void setNovelType(TypeOfNovel novelType) {
        this.novelType = novelType;
    }
    
}
