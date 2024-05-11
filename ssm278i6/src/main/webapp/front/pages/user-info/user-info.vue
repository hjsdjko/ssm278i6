<template>
<view class="content">
	<view class="box" :style='{"padding":"0 24rpx","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"24rpx 0","borderColor":"rgba(0,0,0,0)","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>学号</view>
			<input disabled="true"  style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.xuehao" placeholder="学号"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>姓名</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.xingming" placeholder="姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>密码</view>
			<input  type="password" style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
			<view v-if="tableName=='xuesheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}' class="title">性别</view>
                                <picker  @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>身份证</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.shenfenzheng" placeholder="身份证"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>手机</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.shouji" placeholder="手机"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>邮箱</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>学院</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.xueyuan" placeholder="学院"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>专业</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.zhuanye" placeholder="专业"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>班级</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.banji" placeholder="班级"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='xuesheng'" @tap="xueshengzhaopianTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>照片</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","padding":"0","borderColor":"rgba(0,0,0,0)","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.zhaopian" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.zhaopian" mode=""></image>
				<image :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","padding":"0","borderColor":"rgba(0,0,0,0)","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
			<view v-if="tableName=='xuesheng'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}' class="title">教师姓名</view>
                                <picker  @change="xueshengjiaoshixingmingChange" :value="xueshengjiaoshixingmingIndex" :range="xueshengjiaoshixingmingOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.jiaoshixingming?ruleForm.jiaoshixingming:"请选择教师姓名"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>教师姓名</view>
			<input disabled="true"  style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>密码</view>
			<input  type="password" style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.mima" placeholder="密码"></input>
		</view>
			<view v-if="tableName=='jiaoshi'" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
                                <view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}' class="title">性别</view>
                                <picker  @change="jiaoshixingbieChange" :value="jiaoshixingbieIndex" :range="jiaoshixingbieOptions">
                                        <view style="padding: 0 30upx" :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","padding":"0 20rpx","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                                </picker>
                        </view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>职称</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.zhicheng" placeholder="职称"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>电话</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.dianhua" placeholder="电话"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>邮箱</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.youxiang" placeholder="邮箱"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" @tap="jiaoshitouxiangTap" class="cu-form-group" :class="left == 'left'?'':'active'">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>头像</view>
			<view style="flex: 1;textAlign:left">
				<image :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","padding":"0","borderColor":"rgba(0,0,0,0)","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","padding":"0","borderColor":"rgba(0,0,0,0)","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderRadius":"100%","textAlign":"left","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' v-else class="avator" style="margin: 0;" src="../../static/center/face.jpeg" mode=""></image>
			</view>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>班级</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.banji" placeholder="班级"></input>
		</view>
		<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","padding":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' v-if="tableName=='jiaoshi'" class="cu-form-group">
			<view class="title" :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(255, 255, 255, 0)","color":"rgba(51, 153, 153, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"170rpx","fontSize":"28rpx","lineHeight":"88rpx","borderStyle":"solid"}'>备注</view>
			<input   style="padding: 0 30upx" :style='{"padding":"0","boxShadow":"0 0 12rpx rgba(0,0,0,0)","margin":"0","borderColor":"rgba(0,0,0,0)","backgroundColor":"rgba(0,0,0,0)","color":"red","borderRadius":"0","borderWidth":"0","width":"100%","lineHeight":"88rpx","fontSize":"28rpx","borderStyle":"solid"}' v-model="ruleForm.beizhu" placeholder="备注"></input>
		</view>
		
		<view class="btn">
			<button @tap="update()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","padding":"0 30rpx","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","margin":"0","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			<button @tap="logout()" class="cu-btn lg" :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","padding":"0 30rpx","backgroundColor":"rgba(255, 0, 0, 1)","borderColor":"rgba(255, 0, 0, 1)","margin":"0","borderRadius":"8rpx","color":"#fff","borderWidth":"2rpx","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
		</view>
	</view>
</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
				xueshengjiaoshixingmingOptions: [],
				xueshengjiaoshixingmingIndex: 0,
				jiaoshixingbieOptions: [],
				jiaoshixingbieIndex: 0,
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='xuesheng'){
				this.xueshengxingbieOptions = "男,女".split(',');
				this.xueshengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.xueshengxingbieIndex = index;
					}
				});
			}
			// 下拉框
			if(this.tableName=='xuesheng'){
				res = await this.$api.option(`jiaoshi`,`jiaoshixingming`,{});
				this.xueshengjiaoshixingmingOptions = res.data;
				this.xueshengjiaoshixingmingOptions.forEach((item, index) => {
					if(item==this.ruleForm.jiaoshixingming) {
						this.xueshengjiaoshixingmingIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='jiaoshi'){
				this.jiaoshixingbieOptions = "男,女".split(',');
				this.jiaoshixingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.jiaoshixingbieIndex = index;
					}
				});
			}
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
                        // 下拉变化
                        xueshengjiaoshixingmingChange(e) {
                                this.xueshengjiaoshixingmingIndex = e.target.value
                                this.ruleForm.jiaoshixingming = this.xueshengjiaoshixingmingOptions[this.xueshengjiaoshixingmingIndex]
                        },
                        // 下拉变化
                        jiaoshixingbieChange(e) {
                                this.jiaoshixingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiaoshixingbieOptions[this.jiaoshixingbieIndex]
                        },
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.xuehao) && `xuesheng` == this.tableName){
					this.$utils.msg(`学号不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `xuesheng` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shenfenzheng&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzheng))){
					this.$utils.msg(`身份证应输入身份证格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.dianhua) && `jiaoshi` == this.tableName){
					this.$utils.msg(`电话不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.dianhua&&(!this.$validate.isMobile(this.ruleForm.dianhua))){
					this.$utils.msg(`电话应输入手机格式`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				if((!this.ruleForm.banji) && `jiaoshi` == this.tableName){
					this.$utils.msg(`班级不能为空`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			}

			,xueshengzhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
			,jiaoshitouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	page {
		background-color: #fff;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}
	.cu-form-group .title {
		height: auto;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 88rpx;
	}
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	}
	.box {
	  width: auto;
	  padding: 0 10upx;
	  box-sizing: border-box;
	  margin-bottom: 20upx;
	}

.picker-select-input {
	line-height: 88rpx;
}
</style>
