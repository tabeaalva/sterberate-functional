package ch.bbzbl;

import java.util.List;
import java.util.stream.Collectors;

public class Rechner {

    public long filterByWochentag(List<Sterberate> sterberateListe, String targetWochentag) {
        long filteredCount = sterberateListe.stream()
                .filter(sterberate -> sterberate.getWochentag().equals(targetWochentag))
                
                .count();

        System.out.println("Anzahl der Todesfälle an " + targetWochentag + ": " + filteredCount);
        return filteredCount;
    }

    public void findMaxWeekValueForYear(List<Sterberate> sterberateListe, int year) {
        int maxWeekValue = sterberateListe.stream()
                .filter(sterberate -> Integer.parseInt(sterberate.getJahr()) == year)
                .map(sterberate -> Integer.parseInt(sterberate.getSterbedatum().split("-")[1]))
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Höchster Wochenwert für das Jahr " + year + ": " + maxWeekValue);
    }

    public void calculateTotalDeathsForYear(List<Sterberate> sterberateListe, int targetYear) {
        int totalDeaths = sterberateListe.stream()
                .filter(sterberate -> Integer.parseInt(sterberate.getJahr()) == targetYear)
                .map(sterberate -> Integer.parseInt(sterberate.getAnzTotal()))
                .reduce(0, Integer::sum);

        System.out.println("Gesamtzahl der Todesfälle im Jahr " + targetYear + ": " + totalDeaths);
    }
}