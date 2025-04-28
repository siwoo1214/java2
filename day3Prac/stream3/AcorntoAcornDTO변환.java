package day3Prac.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AcorntoAcornDTO변환 {
	public static void main(String[] args) {
		ArrayList<Acorn> list = new ArrayList<>();
		list.add(new Acorn("a001","박예린","1234"));
		list.add(new Acorn("a002","이정호","0000"));
		list.add(new Acorn("a003","김민환","1010"));
		list.add(new Acorn("a004","김유민","3287"));
		list.add(new Acorn("a005","박수경","2365"));
		list.add(new Acorn("a006","이수민","7542"));
		
		List<AcornDTO> dtoList = list.stream()
		.map(acorn->new AcornDTO(acorn.getId(),acorn.getName()))
		.collect(Collectors.toList());
		
		dtoList.forEach(item->System.out.println(item));
		
		
		List <AcornDTO> dtoList2 = list.stream()
		.map(acorn->new AcornDTO(acorn.getId(),acorn.getName()))
		.collect(Collectors.toList());
		dtoList2.forEach(item->System.out.println(item));
	}
}
