package oe.market.common.chabun.service;

import oe.market.board.vo.OeBoardVO;
import oe.market.comm.vo.OeCommVO;
import oe.market.like.vo.OeLikeVO;
import oe.market.mem.vo.OeMemVO;

public interface OeChabunService {
	
	public OeMemVO getOeMemberChabun();
	public OeBoardVO getOeBoardChabun();
	public OeCommVO getOeCommChabun();
	public OeLikeVO getOeLikeChabun();
	
}
