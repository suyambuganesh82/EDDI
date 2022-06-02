package ai.labs.eddi.modules.output.model;

import ai.labs.eddi.modules.output.model.types.*;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TextOutputItem.class, name = "text"),
        @JsonSubTypes.Type(value = ImageOutputItem.class, name = "image"),
        @JsonSubTypes.Type(value = BotFaceOutputItem.class, name = "botFace"),
        @JsonSubTypes.Type(value = QuickReplyOutputItem.class, name = "quickReply"),
        @JsonSubTypes.Type(value = OtherOutputItem.class, name = "other")
})
@Getter
@Setter
public abstract class OutputItem {
    protected String type;

    protected abstract void initType();
}
