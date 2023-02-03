package com.collections.list;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListStreamingAPI2 {
    public static void main(String[] args) {

            /*

        List<Bus> busList = TravelFactory.search("Hyd","Kodad").stream()
                .sorted((b1,b2) -> b1.getPrice().compareTo(b2.getPrice()))
                .collect(Collectors.toList());
             */

       List<Bus> busList = TravelFactory.search("Hyd","Kodad");
        busList.stream().forEach(System.out::println);

        System.out.println(" Sort By Price");
        List<Bus> sortList =     busList.stream()
                    .sorted(Comparator.comparing(Bus::getPrice))
                     .collect(Collectors.toList());
        sortList.stream().forEach(System.out::println);

        System.out.println(" get BusTypes ");
        Set<String> busTypes =
                busList.stream().map(Bus::getBusType).collect(Collectors.toSet());
        System.out.println(busTypes);

        System.out.println(" \n Sort By duration then price");
        List<Bus> sortList2 =     busList.stream()
                .sorted(Comparator.comparing(Bus::getDuration).thenComparing(Bus::getPrice))
                .collect(Collectors.toList());
        sortList2.stream().forEach(System.out::println);

    }
}

class TravelFactory
{
    private static List<Bus> busList = new LinkedList<>();

   static
    {
        Bus b1 = Bus.builder()
                .busNo(1)
                .busType("Luxury")
                .price(500f)
                .startingPoint("Hyd")
                .droppingPoint("Kodad")
                .duration(90)
                .build();

        busList.add(b1);

        busList.add(
                Bus.builder()
                        .busNo(2)
                        .busType("Luxury")
                        .price(450f)
                        .startingPoint("Hyd")
                        .droppingPoint("Kodad")
                        .duration(95)
                        .build()
        );

        busList.add(
            Bus.builder()
                    .busNo(3)
                    .busType("Express")
                    .price(250f)
                    .startingPoint("Hyd")
                    .droppingPoint("Kodad")
                    .duration(120)
                    .build()
    );

        busList.add(
            Bus.builder()
                    .busNo(4)
                    .busType("Luxury")
                    .price(700f)
                    .startingPoint("Hyd")
                    .droppingPoint("VYD")
                    .duration(200)
                    .build()
                 );



        busList.add(Bus.builder()
                .busNo(5)
                .busType("Luxury")
                .price(350f)
                .startingPoint("Hyd")
                .droppingPoint("Kodad")
                .duration(90)
                .build());

    }

    public static List<Bus> search(String startPoint , String endPoint)
    {
      return   busList.stream().filter(
                bus ->
                bus.getStartingPoint().equals(startPoint)
                && bus.getDroppingPoint().equals(endPoint)
                                     ).collect(Collectors.toList());
    }

}

@Builder
@Setter
@Getter
class Bus
{
    private Integer busNo;
    private String busType;
    private Float price;
    private String startingPoint;
    private String droppingPoint;
    private Integer duration;

    @Override
    public String toString() {
        return "Bus{" +
                "busNo=" + busNo +
                ", busType='" + busType + '\'' +
                ", price=" + price +
                ", startingPoint='" + startingPoint + '\'' +
                ", droppingPoint='" + droppingPoint + '\'' +
                ", duration=" + duration +
                '}';
    }
}
