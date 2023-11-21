package wedatalab.bulletinboard.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import wedatalab.bulletinboard.domain.Board;
import wedatalab.bulletinboard.domain.Reply;
import wedatalab.bulletinboard.service.BoardService;
import wedatalab.bulletinboard.service.ReplyService;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;
    private final ReplyService replyService;

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }

    // 추가3
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());

        return "/boards/hello";
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("list", service.boardList());

        return "/boards/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId) {

        service.viewCount(boardId);

        model.addAttribute("replyReplyList", replyService.getReplyReply(boardId));
        model.addAttribute("replyList", replyService.getReply(boardId));
        model.addAttribute("halo", service.getBoard(boardId));

        return "/boards/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm(){
        return "/boards/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board){
        service.uploadBoard(board);

        return "redirect:/board/main";
    }

    @GetMapping("/update")
    public String updateBoardForm(Model model, Long boardId){
        model.addAttribute("update", service.getBoard(boardId));

        return "/boards/update";
    }

    @PostMapping ("/update")
    public String updateBoard(Board board){
        service.updateBoard(board);
        return "redirect:/board/main";
    }

    @GetMapping("/delete")
    public String deleteBoard(Long boardId){
        service.deleteBoard(boardId);

        return "redirect:/board/main";
    }

    @PostMapping("/view")
    public String uploadReply(Long boardId, Reply reply){
        replyService.uploadReply(reply);

        return "redirect:/board/view?boardId="+boardId;
    }

    @GetMapping("/deleteReply")
    public String deleteReply(Long boardId, int rno){
        replyService.deleteReply(rno);
        return "redirect:/board/view?boardId="+boardId;
    }


    @PostMapping("/uploadReplyReply")
    public String uploadReplyReply(Long boardId, Reply reply){
        replyService.uploadReplyReply(reply);
        return "redirect:/board/view?boardId="+boardId;
    }


    @PostMapping("/updateReplyReply")
    public String updateReplyReply(Long boardId, Reply reply){
        replyService.updateReplyReply(reply);
        return "redirect:/board/view?boardId="+boardId;
    }

    @GetMapping("/deleteReplyReply")
    public String deleteReplyReply(Long boardId, Long rno){
        replyService.deleteReplyReply(rno);
        return "redirect:/board/view?boardId="+boardId;
    }
}
