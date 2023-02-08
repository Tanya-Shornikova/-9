package com.company.Univer;

import java.util.HashSet;
import java.util.Set;

public class Asdf {
    public static void main(String[] args) {
        University u1 = new University("РУТ", 40000, 2000, 180);
        University u2 = new University("МФТИ", 7000, 3000, 180);
        University u3 = new University("МГУ", 37000, 11000, 180);
        University u4 = new University("ДВГУПС", 15000, 100, 180);
        University u5 = new University("СПбГУ", 20000, 1000, 180);
        University u6 = new University("ВШЭ", 48000, 1000, 180);
        University u7 = new University("МГИМО", 9000, 2000, 180);

        Set<University> humUniversity = new HashSet<>();
        humUniversity.add(u6);
        humUniversity.add(u7);
        humUniversity.add(u3);
        humUniversity.add(u5);
        System.out.println(humUniversity);
        System.out.println();
        Set<University> techUniversity = new HashSet<>();
        techUniversity.add(u1);
        techUniversity.add(u2);
        techUniversity.add(u3);
        techUniversity.add(u4);
        techUniversity.add(u5);
        System.out.println(techUniversity);
        System.out.println();

        Set<University> allUniversity = new HashSet<>();
        allUniversity.addAll(humUniversity);
        allUniversity.addAll(techUniversity);
        System.out.println(allUniversity);
        System.out.println();

        int c = 0;
        for (University u:
             allUniversity) {
            c = c + u.getStudentCont();
        }
        System.out.println("Всего студентов: " + c);
        System.out.println();

        int o = 0;
        for (University u:
             allUniversity) {
            o = o + u.getPrepodCont();
        }
        System.out.println("Всего преподователей: " + o);
        System.out.println();

        int[] t = {u1.getEgeCont(), u2.getEgeCont(), u3.getEgeCont(), u4.getEgeCont(), u5.getEgeCont(), u6.getEgeCont(), u7.getEgeCont()};
        int result = 0;
        for ( int m : t ) {
            result += m;
        }
        System.out.println("Средний бал для поступление в вуз: " + result / t.length);
        System.out.println();

        Set<University> humAndtechUniversity = new HashSet<>();
        humAndtechUniversity.addAll(humUniversity);
        humAndtechUniversity.retainAll(techUniversity);
        System.out.println(humAndtechUniversity);
        System.out.println();

        Set<University> SpechialUniversity = new HashSet<>();
        SpechialUniversity.addAll(allUniversity);
        SpechialUniversity.removeAll(humAndtechUniversity);
        System.out.println(SpechialUniversity);
        System.out.println();
    }
}
