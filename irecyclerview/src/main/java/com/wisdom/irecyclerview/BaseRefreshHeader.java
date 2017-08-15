package com.wisdom.irecyclerview;

/**
 * ================================================
 * 作    者：朱志强 Github地址：https://github.com/ZZhiQiang/MavenJcenter
 * 版    本：1.0
 * 创建 日期：17/08/15
 * 描    述：头部刷新控件Base
 * 修订 历史：
 * ================================================
 */
interface BaseRefreshHeader {

	int STATE_NORMAL = 0;
	int STATE_RELEASE_TO_REFRESH = 1;
	int STATE_REFRESHING = 2;
	int STATE_DONE = 3;

	void onMove(float delta);

	boolean releaseAction();

	void refreshComplete();

}