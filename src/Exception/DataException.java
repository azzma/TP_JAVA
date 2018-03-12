/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author asmaa
 */
public class DataException {
private String description ;
    public DataException() {
    }

    public DataException(String description) {
        this.description = description;
    }

    public String getMessage() {
        
        
        return description;
    }
    
    
}
