package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {
    @Id
        private String authorId;
        private String name;
        @ManyToMany(mappedBy = "authorList")
        private List<Book>bookList;
    }

