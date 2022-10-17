package de.zorro909.discordnotifier.api;

import io.micronaut.core.annotation.Introspected;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A DTO for the DiscordNotification entity
 */

@AllArgsConstructor
@Introspected
@ToString
@Value
@Builder
@Jacksonized
public class DiscordNotificationDto {

    @NotNull
    private Long id;
    @NotNull
    private String source;
    @NotNull
    private String  message;
    @Nullable
    private String  webhookUrl;
    private boolean sent;

}