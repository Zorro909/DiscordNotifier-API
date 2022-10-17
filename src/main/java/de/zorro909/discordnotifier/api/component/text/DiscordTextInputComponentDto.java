package de.zorro909.discordnotifier.api.component.text;

import de.zorro909.discordnotifier.api.component.DiscordInteractionComponentDto;
import io.micronaut.core.annotation.Introspected;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Introspected
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Jacksonized
@ToString
public class DiscordTextInputComponentDto {

    @NotNull
    private String interactionId;

    @NotNull
    private String label;

    @Nullable
    private String placeholder;

    @Builder.Default
    private int minLength = 0;

    @Builder.Default
    private int maxLength = 4000;

    @Builder.Default
    private boolean isRequired = true;

    @Builder.Default
    private boolean multiline = false;

}
