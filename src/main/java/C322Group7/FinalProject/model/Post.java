package C322Group7.FinalProject.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Post {

    private String userName;
    private String boardName;
    private String content;
    private String date;
    private Status status;
}
