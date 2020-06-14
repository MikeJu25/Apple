package SQL;

import java.sql.SQLException;

/**
 * @see java.util.function.Consumer
 * @param <T>
 */
@FunctionalInterface
public interface SQLCustomerFUN<T> {
    void accept(T t) throws SQLException;
}