package model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.time.LocalDate;

@Converter
public class TanggalConverter implements AttributeConverter<String, LocalDate> {

    @Override
    public LocalDate convertToDatabaseColumn(String tanggal) {
        return tanggal == null ? null : LocalDate.parse(tanggal, Pengadaan.FORMAT_TANGGAL);
    }

    @Override
    public String convertToEntityAttribute(LocalDate tanggal) {
        return tanggal == null ? null : tanggal.format(Pengadaan.FORMAT_TANGGAL);
    }
}
