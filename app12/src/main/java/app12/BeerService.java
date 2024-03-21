package app12;

import java.util.List;

public class BeerService {
	private BeerDAO dao = new BeerDAO(); // TODO: singleton
	
	public BeerDTO getBeerPage(int page, int pagePer) {
		int totalCount = dao.countAll();
		int totalPage = totalCount / pagePer;
		totalPage += totalCount % pagePer == 0 ? 0 : 1 ;
		
		List<Beer> list = dao.getAll(pagePer, pagePer * (page - 1));
		
		BeerDTO dto = BeerDTO.builder()
			.totalPages(totalPage)
			.currentPage(page)
			.itemsperPage(page)
			.items(list)
			.build();
		return dto;
	}

	public int insert(Beer beer) {

		return dao.insert(beer);
	}

	public int delete(Integer id) {
		// TODO: 삭제 수행 전 해당 id의 beer행이 있는 지 확인해야함. 없는 경우 적절한 응답 필요
		// TODO: 여러 DB 작업을 수행할 커넥션, 트랜잭션 관리
		int result = dao.delete(id);
		return result;
	}

	public int update(Beer beer) {
		// TODO: 삭제 수행 전 해당 id의 beer행이 있는 지 확인해야함. 없는 경우 적절한 응답 필요
		// TODO: 여러 DB 작업을 수행할 커넥션, 트랜잭션 관리
		int result = dao.update(beer);
		return 0;
	}
}
