package com.example.codingpractice.more;

import java.util.*;

public class SortingMusic {

    public int[] solution(String[] genres, int[] plays) {

        List<Integer> answerList = new ArrayList<>();

        List<Genre> genresList = new ArrayList<>();
        for(int i = 0 ; i < genres.length ; i++) {
            int finalI = i;
            Genre genre = genresList.stream().filter(ge -> ge.getGenre().equals(genres[finalI])).findFirst().orElse(null);
            if(genre!=null) {
                genre.setPlay(new Song(plays[i], i));
                genre.sumPlay(plays[i]);
            } else {
                List<Song> songList = new ArrayList<>();
                songList.add(new Song(plays[i], i));
                genresList.add(new Genre(genres[i], songList, plays[i]));
            }
        }

        Collections.sort(genresList);
        for(Genre genre : genresList) {
            genre.orderSong();
            if(genre.getPlay().size()==1) answerList.add(genre.getPlay().get(0).getOrder());
            else {
                answerList.add(genre.getPlay().get(0).getOrder());
                answerList.add(genre.getPlay().get(1).getOrder());
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Genre implements Comparable<Genre>{

    private String genre;
    private List<Song> play;
    private int sumPlay;

    Genre(String genre, List<Song> play, int sumPlay) {
        this.genre = genre;
        this.play = play;
        this.sumPlay = sumPlay;
    }

    public String getGenre() {
        return genre;
    }

    public void setPlay(Song song) {
        play.add(song);
    }

    public void sumPlay(int count) {
        this.sumPlay+=count;
    }

    public void orderSong() {
        Collections.sort(this.play);
    }

    public List<Song> getPlay() {
        return play;
    }

    @Override
    public int compareTo(Genre o) {
        return o.sumPlay > sumPlay ? 1 : -1;
    }
}

class Song implements Comparable<Song>{

    private int play;
    private int order;

    Song(int play, int order) {
        this.play = play;
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public int compareTo(Song o) {
        return o.play >= play ? 1 : -1;
    }
}
