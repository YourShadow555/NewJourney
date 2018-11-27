package com.my.lei.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCointerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        blankDisc.setArtist("The Beatles");
        List<String> tracks = new ArrayList<String>();
        tracks.add("Sgt. People's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");

        blankDisc.setTracks(tracks);
        return blankDisc;
    }
    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
