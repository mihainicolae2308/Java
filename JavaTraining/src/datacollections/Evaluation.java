/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datacollections;

import logging.*;

/**
 *
 * @author Mihai
 */
public class Evaluation {
    
    private float stars;
    
    private int user_id;
    
    private StringBuilder description;

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public StringBuilder getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(StringBuilder description) {
        this.description = description;
    }


    /**
     * Get the value of user_id
     *
     * @return the value of user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * Set the value of user_id
     *
     * @param user_id new value of user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
    /**
     * Get the value of stars
     *
     * @return the value of stars
     */
    public float getStars() {
        return stars;
    }

    /**
     * Set the value of stars
     *
     * @param stars new value of stars
     */
    public void setStars(float stars) {
        this.stars = stars;
    }

}
