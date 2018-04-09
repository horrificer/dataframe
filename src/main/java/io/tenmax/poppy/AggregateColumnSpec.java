package io.tenmax.poppy;

import java.util.stream.Collector;

public class AggregateColumnSpec<T> {
    private final String column;
    private final Class<T> type;
    private final String typeFromColumn;
    private final Collector<DataRow, ?, T> collector;

    public AggregateColumnSpec(String column, Class<T> type, Collector<DataRow, ?, T> collector) {
        this.column = column;
        this.type = type;
        this.typeFromColumn = null;
        this.collector = collector;
    }

    public AggregateColumnSpec(String column, String typeFromColumn, Collector<DataRow, ?, T> collector) {
        this.column = column;
        this.type = null;
        this.typeFromColumn = typeFromColumn;
        this.collector = collector;
    }

    public String getColumn() {
        return column;
    }

    public Class<T> getType() {
        return type;
    }

    public String getTypeFromColumn() {
        return typeFromColumn;
    }

    public Collector<DataRow, ?, T> getCollector() {
        return collector;
    }
}

