package de.zorro909.discordnotifier.api.webhook;

import io.micronaut.core.annotation.Introspected;

import lombok.*;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;


@AllArgsConstructor
@Introspected
@Value
@ToString
@Builder
@Jacksonized
public class DiscordInteractionDto {

    @NotNull
    private String interactionId;

    @Nullable
    @Singular
    private Map<String, String> values;

}
