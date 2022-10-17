package de.zorro909.discordnotifier.api.component.select;

import de.zorro909.discordnotifier.api.component.ComponentType;
import de.zorro909.discordnotifier.api.component.DiscordInteractionComponentDto;
import io.micronaut.core.annotation.Introspected;

import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;

@Introspected
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Jacksonized
@ToString(callSuper = true)
public class DiscordSelectMenuComponentDto extends DiscordInteractionComponentDto {

    @NotNull
    private SelectOptionDto[] options;

    @Builder.Default
    private ComponentType type = ComponentType.SELECT_MENU;

    public abstract static class DiscordSelectMenuComponentDtoBuilder<C extends DiscordSelectMenuComponentDto, B extends DiscordSelectMenuComponentDto.DiscordSelectMenuComponentDtoBuilder<C, B>> extends DiscordInteractionComponentDto.DiscordInteractionComponentDtoBuilder<C, B> {
        public DiscordSelectMenuComponentDtoBuilder() {
            type(ComponentType.SELECT_MENU);
        }
    }
}
