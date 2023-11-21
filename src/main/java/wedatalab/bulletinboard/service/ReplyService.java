package wedatalab.bulletinboard.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wedatalab.bulletinboard.domain.Reply;
import wedatalab.bulletinboard.mapper.ReplyMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyMapper replyMapper;

    public List<Reply> getReply(Long boardId) {
        return replyMapper.getReply(boardId);
    }

    public Reply getBoardId(Long boardId) {
        return replyMapper.getBoardId(boardId);
    }

    public void uploadReply(Reply reply) {
        replyMapper.uploadReply(reply);
    }

    public void updateReply(Reply reply) {
        replyMapper.updateReply(reply);
    }

    public void deleteReply(int rno) {
        replyMapper.deleteReply(rno);
    }

    public void uploadReplyReply(Reply reply){
        replyMapper.uploadReplyReply(reply);
    }

    public List<Reply> getReplyReply(Long boardId){
        return replyMapper.getReplyReply(boardId);
    }

    public void updateReplyReply(Reply reply){
        replyMapper.updateReplyReply(reply);
    }

    public void deleteReplyReply(Long rno){
        replyMapper.deleteReplyReply(rno);
    }
}