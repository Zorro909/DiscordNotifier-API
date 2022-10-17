package de.zorro909.discordnotifier.api.component.select;

import io.micronaut.core.annotation.Introspected;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@Introspected
@Builder
@Jacksonized
@ToString
@Value
public class SelectOptionDto {

    @NotNull
    private String  label;
    @Nullable
    private String  optionValue;
    @Nullable
    private String  description;
    @Nullable
    private Boolean defaultSelected;

}
