package de.zorro909.discordnotifier.api.component;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import de.zorro909.discordnotifier.api.component.button.DiscordButtonComponentDto;
import de.zorro909.discordnotifier.api.component.select.DiscordSelectMenuComponentDto;
import de.zorro909.discordnotifier.api.component.text.DiscordTextInputComponentDto;
import io.micronaut.core.annotation.Introspected;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;


@Introspected
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DiscordButtonComponentDto.class, name = "BUTTON"),
        @JsonSubTypes.Type(value = DiscordSelectMenuComponentDto.class, name = "SELECT_MENU"),
})
@Data
@SuperBuilder
@Jacksonized
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DiscordInteractionComponentDto {

    @NotNull
    private ComponentType type;

    @NotNull
    private String interactionId;

    @NotNull
    private String label;

}
