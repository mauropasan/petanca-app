package es.mpastor.petancaapp.model.dto;

import java.util.Set;

public class Team implements Comparable<Team> {

    private int id;

    private String name;

    private int wins;

    private int loses;

    private int draws;

    private int forPoints;

    private int againstPoints;

    private int points;

    private float coefficient;

    private Set<User> members;

    public Team(int id, String name, int wins, int loses, int draws, int forPoints, int againstPoints, int points, float coefficient, Set<User> members) {
        this.id = id;
        this.name = name;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.forPoints = forPoints;
        this.againstPoints = againstPoints;
        this.points = points;
        this.coefficient = coefficient;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public int getForPoints() {
        return forPoints;
    }

    public int getAgainstPoints() {
        return againstPoints;
    }

    public int getPoints() {
        return points;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public Set<User> getMembers() {
        return members;
    }

    @Override
    public int compareTo(Team team) {
        return Integer.compare(this.id, team.id);
    }
}
