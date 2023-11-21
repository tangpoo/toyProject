package wedatalab.bulletinboard.domain;

import java.sql.Date;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
    private Long boardId;
    private int rno;
    private String content;
    private String writer;
    private Long parentId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Date regdate;
}
