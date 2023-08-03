package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {
    @Id
    private String authorId;
    private String name;
    public void setbook(Book book) {
        this.book = book;
    }

    @OneToOne
    private Book book;
}
