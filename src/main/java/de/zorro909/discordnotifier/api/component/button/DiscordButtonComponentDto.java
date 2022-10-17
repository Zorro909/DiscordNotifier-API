package de.zorro909.discordnotifier.api.component.button;

import de.zorro909.discordnotifier.api.component.ComponentType;
import de.zorro909.discordnotifier.api.component.DiscordInteractionComponentDto;
import de.zorro909.discordnotifier.api.component.text.DiscordTextInputComponentDto;
import io.micronaut.core.annotation.Introspected;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;


@Introspected
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Jacksonized
@ToString(callSuper = true)
public class DiscordButtonComponentDto extends DiscordInteractionComponentDto {

    @Builder.Default
    @NotNull
    private ButtonStyle buttonStyle = ButtonStyle.PRIMARY;

    @Builder.Default
    @Nullable
    private String linkUrl = null;

    @Nullable
    @Singular
    private List<DiscordTextInputComponentDto> modalTextInputs;


    public abstract static class DiscordButtonComponentDtoBuilder <C extends DiscordButtonComponentDto, B extends DiscordButtonComponentDtoBuilder<C, B>> extends DiscordInteractionComponentDto.DiscordInteractionComponentDtoBuilder<C, B>{
        public DiscordButtonComponentDtoBuilder() {
            type(ComponentType.BUTTON);
        }    }

}
