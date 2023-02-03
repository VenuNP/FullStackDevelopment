package com.collections.list;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListEqualsEx {
    public static void main(String[] args) {

        List<Sample> list = new ArrayList<>();

        list.add(Sample.builder()
                        .id(1)
                        .name("Srinu")
                .build());

        list.add(Sample.builder()
                .id(2)
                .name("Venu")
                .build());

        list.add(Sample.builder()
                .id(3)
                .name("Akash")
                .build());

        System.out.println(" \n List Data");
        list.forEach(System.out::println);


       Sample sampleID = Sample.builder()
                    .id(1)
                    .build();

      System.out.println( " SampleID 1 present ? "+list.contains(sampleID));
    }
}
@Builder
@Setter
@Getter
class Sample
{
    int id;
    String name;


    @Override
    public boolean equals(Object o) {
        if(o == null)
        {
            return false;
        }
        Sample sample = (Sample)o;

        return this.id == sample.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}