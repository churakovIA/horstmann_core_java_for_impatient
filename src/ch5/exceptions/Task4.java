package ch5.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Repeat the preceding exercise, but don’t use exceptions. Instead, have
 * readValues and sumOfValues return error codes of some kind.
 */
public class Task4 {

    public Status readValues(String filename, List<Double> result) {
        Objects.requireNonNull(filename, "filename must not be null");
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                result.add(Double.parseDouble(sc.next()));
            }
        } catch (FileNotFoundException e) {
            return Status.FILE_NOT_FOUND;
        } catch (NumberFormatException e) {
            return Status.WRONG_FORMAT;
        }
        return Status.OK;
    }

    public Status sumOfValues(String filename, double[] result) {
        List<Double> list = new ArrayList<>();
        Status status = readValues(filename, list);
        if (status == Status.OK) {
            result[0] = list.stream().mapToDouble(Double::doubleValue).sum();
        }
        return status;
    }

    public enum Status {OK, FILE_NOT_FOUND, WRONG_FORMAT}

}
