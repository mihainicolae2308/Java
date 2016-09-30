/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logging;

/**
 *
 * @author mnicolae
 */
public class ArtAlbum extends Book {
    public enum PaperQuality { LOW, MEDIUM, HIGH }
    private PaperQuality quality;
    
    public PaperQuality getQality() {
        return quality;
    }
    
    public void setQuality(PaperQuality quality) {
        this.quality = quality;
    }
}
