package nl.rijkswaterstaat.java17.mathieu.record;

import java.math.BigDecimal;

public record OrderLine(Product product, Long quantity, BigDecimal price) {
}
