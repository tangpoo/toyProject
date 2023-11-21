package wedatalab.bulletinboard.mapper;

import org.springframework.stereotype.Repository;
import wedatalab.bulletinboard.domain.Reply;

import java.util.List;

@Repository
public interface ReplyMapper {

    List<Reply> getReply(Long boardId);

    Reply getBoardId(Long boardId);

    void uploadReply(Reply reply);

    void updateReply(Reply reply);

    void deleteReply(int rno);

    void uploadReplyReply(Reply reply);

    List<Reply> getReplyReply(Long boardId);

    void updateReplyReply(Reply reply);

    void deleteReplyReply(Long rno);
}
