package section16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class ResultVO {
	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}


public class Collection06 {
	
	public static void main(String[] args) {
		
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("홍길동");
		member1.setMobile("0101111");
		member1.setAddress("서울특별시");
		
		member2.setNo(2);
		member2.setName("짱구");
		member2.setMobile("0102222");
		member2.setAddress("떡잎마을");
		
		memberList.add(member1);
		memberList.add(member2);
		
		System.out.println("no\tname\tmobile\taddress");
		for(MemberVO member : memberList) {
			int no = member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			String address = member.getAddress();
			
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+address);
		}
		
		
		List<ResultVO> resultList 
					= memberList.stream()
								.map(m -> {
									ResultVO resultVO = new ResultVO();
									resultVO.setName(m.getName());
									resultVO.setAddress(m.getAddress());
									return resultVO;
								})
								.collect(Collectors.toList());
	}
}










