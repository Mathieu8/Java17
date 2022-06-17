package nl.rijkswaterstaat.java17.mathieu.record;

import java.time.LocalDateTime;
import java.util.List;

public record Order(long id, Costomer costomer, LocalDateTime dateTime, List<OrderLine> lines) {
//    public Order(long id, Costomer costomer, LocalDateTime dateTime, List<OrderLine> lines) {
//        Validation.checkThat(costomer != null, "costumer is null");
//        Validation.checkThat(dateTime!= null, "dateTime is null");
//        Validation.checkThat(lines!= null && !lines.isEmpty(), "lines is null");
//        this.id = id;
//        this.costomer = costomer;
//        this.dateTime = dateTime;
//        this.lines = List.copyOf(lines);
//    }

    public Order {
        Validation.checkThat(costomer!= null, "costumer is null");
    }

    public Order(Costomer costomer, LocalDateTime dateTime, List<OrderLine> lines){
        this(1, costomer,dateTime,lines);
    }

    public Order(Costomer costomer, List<OrderLine> lines){
        this(costomer, LocalDateTime.now(), lines);
    }

}
