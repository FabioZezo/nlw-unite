package rocketseat.com.passin.dto.event;

public record EventDetailDTO(
        String id,
        String title,
        String detasils,
        String slug,
        Integer maximunAttendees,
        Integer attendeesAmount
) {
}
