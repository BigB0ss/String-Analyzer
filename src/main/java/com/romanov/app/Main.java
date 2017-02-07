package main.java.com.romanov.app;

import main.java.com.romanov.analyzer.StringAnalyzer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String delimiter=" +-*/,.?!;:";
        String str="\n" +
                "Песнь первая." +
                "Язва, гнев." +
                "" +
                "Гнев, богиня, воспой Ахиллеса, Пелеева сына," +
                "Грозный, который ахеянам тысячи бедствий соделал:" +
                "Многие души могучие славных героев низринул" +
                "В мрачный Аид и самих распростер их в корысть плотоядным" +
                "Птицам окрестным и псам (совершалася Зевсова воля),";
       List<String> list= StringAnalyzer.stringBreaker(str,delimiter);
        list.stream().forEach(elem->System.out.println(elem));

    }
}
