package de.zorro909.discordnotifier.api;

import de.zorro909.discordnotifier.api.component.ComponentType;
import de.zorro909.discordnotifier.api.component.DiscordInteractionComponentDto;
import io.micronaut.core.annotation.Introspected;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.Nullable;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Introspected
@Builder
@Jacksonized
@ToString
@Value
public class EditNotificationDto {

    @Nullable
    private String                                     title;
    @Nullable
    private String                                     message;
    @Nullable
    private String                                     imageUrl;
    @Nullable
    private String                                     webhookUrl;
    @Nullable
    @Size(max = 5)
    private List<List<DiscordInteractionComponentDto>> components;

    public static class EditNotificationDtoBuilder {

        public EditNotificationDtoBuilder addComponent(DiscordInteractionComponentDto newComponent) {
            if (components == null) {
                components = new ArrayList<>();
            }

            List<DiscordInteractionComponentDto> row;

            if (components.isEmpty()) {
                row = nextRow();
            } else {
                row = components.get(components.size() - 1);
            }

            if (isRowFull(row, newComponent.getType())) {
                row = nextRow();
            }

            row.add(newComponent);

            if (components.size() > 5) {
                throw new IllegalArgumentException("You can only have 5 rows of components");
            }

            return this;
        }

        private List<DiscordInteractionComponentDto> nextRow() {
            List<DiscordInteractionComponentDto> row = new ArrayList<>();
            components.add(row);
            return row;
        }

        private boolean isRowFull(List<DiscordInteractionComponentDto> row, ComponentType insertType) {
            if (row.size() == 5) {
                return true;
            }

            if (row.size() > 0) {
                DiscordInteractionComponentDto first = row.get(0);
                if (first.getType() == ComponentType.SELECT_MENU) {
                    return true;
                } else return insertType == ComponentType.SELECT_MENU;
            }

            return false;
        }
    }
}