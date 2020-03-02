package id.putraprima.skorbola.model;

import android.graphics.Bitmap;

public class User {
    private String hometeam;
    private String awayteam;
    private Bitmap homelogo;
    private Bitmap awaylogo;
    private String homescore;
    private String awayscore;

    public User(String hometeam, String awayteam) {
        this.hometeam = hometeam;
        this.awayteam = awayteam;
    }

    public User(String hometeam, String awayteam, Bitmap homelogo, Bitmap awaylogo, String homescore, String awayscore) {
        this.hometeam = hometeam;
        this.awayteam = awayteam;
        this.homelogo = homelogo;
        this.awaylogo = awaylogo;
        this.homescore = homescore;
        this.awayscore = awayscore;
    }

    public String getHometeam() {
        return hometeam;
    }

    public void setHometeam(String hometeam) {
        this.hometeam = hometeam;
    }

    public String getAwayteam() {
        return awayteam;
    }

    public void setAwayteam(String awayteam) {
        this.awayteam = awayteam;
    }

    public Bitmap getHomelogo() {
        return homelogo;
    }

    public void setHomelogo(Bitmap homelogo) {
        this.homelogo = homelogo;
    }

    public Bitmap getAwaylogo() {
        return awaylogo;
    }

    public void setAwaylogo(Bitmap awaylogo) {
        this.awaylogo = awaylogo;
    }

    public String getHomescore() {
        return homescore;
    }

    public void setHomescore(String homescore) {
        this.homescore = homescore;
    }

    public String getAwayscore() {
        return awayscore;
    }

    public void setAwayscore(String awayscore) {
        this.awayscore = awayscore;
    }

}
