<template>
  <div class="app-container decision-dashboard">
    <!-- 页面标题 -->
    <div class="dashboard-header">
      <h1 class="page-title">决策看板</h1>
      <p class="page-subtitle">数据概览与分析</p>
    </div>

    <!-- 数据卡片区域 -->
    <el-row :gutter="20" class="card-row">
      <el-col :xs="24" :sm="12" :lg="6">
        <el-card shadow="hover" class="data-card">
          <div class="card-content">
            <div class="card-icon" style="background: #f0f9ff;">
              <i class="el-icon-user" style="color: #409EFF;"></i>
            </div>
            <div class="card-info">
              <div class="card-value">1,234</div>
              <div class="card-label">用户总数</div>
            </div>
          </div>
        </el-card>
      </el-col>

      <el-col :xs="24" :sm="12" :lg="6">
        <el-card shadow="hover" class="data-card">
          <div class="card-content">
            <div class="card-icon" style="background: #f0f9ff;">
              <i class="el-icon-s-data" style="color: #67C23A;"></i>
            </div>
            <div class="card-info">
              <div class="card-value">¥ 56,789</div>
              <div class="card-label">本月营收</div>
            </div>
          </div>
        </el-card>
      </el-col>

      <el-col :xs="24" :sm="12" :lg="6">
        <el-card shadow="hover" class="data-card">
          <div class="card-content">
            <div class="card-icon" style="background: #fdf6ec;">
              <i class="el-icon-trend" style="color: #E6A23C;"></i>
            </div>
            <div class="card-info">
              <div class="card-value">+12.5%</div>
              <div class="card-label">增长率</div>
            </div>
          </div>
        </el-card>
      </el-col>

      <el-col :xs="24" :sm="12" :lg="6">
        <el-card shadow="hover" class="data-card">
          <div class="card-content">
            <div class="card-icon" style="background: #fef0f0;">
              <i class="el-icon-warning" style="color: #F56C6C;"></i>
            </div>
            <div class="card-info">
              <div class="card-value">3</div>
              <div class="card-label">待处理预警</div>
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>

    <!-- 图表区域 -->
    <el-row :gutter="20" class="chart-row">
      <el-col :xs="24" :lg="12">
        <el-card shadow="hover" class="chart-card">
          <template #header>
            <span>月度营收趋势</span>
            <el-button type="text">详情</el-button>
          </template>
          <div id="revenue-chart" class="chart-container">
            <!-- 这里可以放置ECharts图表 -->
            <div style="text-align: center; padding: 50px;">
              <p>营收趋势图区域</p>
              <p>可使用ECharts、AntV等图表库</p>
            </div>
          </div>
        </el-card>
      </el-col>

      <el-col :xs="24" :lg="12">
        <el-card shadow="hover" class="chart-card">
          <template #header>
            <span>业务分布</span>
            <el-button type="text">详情</el-button>
          </template>
          <div id="business-chart" class="chart-container">
            <div style="text-align: center; padding: 50px;">
              <p>业务分布图区域</p>
              <p>饼图、环形图等</p>
            </div>
          </div>
        </el-card>
      </el-col>
    </el-row>

    <!-- 数据表格区域 -->
    <el-card shadow="hover" class="table-card">
      <template #header>
        <span>关键指标列表</span>
        <el-button type="primary" size="small">导出数据</el-button>
      </template>
      <el-table :data="tableData" stripe style="width: 100%">
        <el-table-column prop="name" label="指标名称" width="180" />
        <el-table-column prop="value" label="当前值" width="120" />
        <el-table-column prop="change" label="变化率" width="120">
          <template #default="scope">
            <span :class="scope.row.change >= 0 ? 'positive' : 'negative'">
              {{ scope.row.change >= 0 ? '+' : '' }}{{ scope.row.change }}%
            </span>
          </template>
        </el-table-column>
        <el-table-column prop="status" label="状态" width="120">
          <template #default="scope">
            <el-tag :type="getStatusType(scope.row.status)">
              {{ scope.row.status }}
            </el-tag>
          </template>
        </el-table-column>
        <el-table-column prop="date" label="更新时间" />
        <el-table-column label="操作" width="120">
          <template #default>
            <el-button type="text" size="small">详情</el-button>
            <el-button type="text" size="small">分析</el-button>
          </template>
        </el-table-column>
      </el-table>
    </el-card>
  </div>
</template>

<script setup name="DecisionDashboard">
import { ref, onMounted } from 'vue'

// 表格数据
const tableData = ref([
  { name: '用户活跃度', value: '78%', change: 5.2, status: '良好', date: '2024-01-15' },
  { name: '转化率', value: '12.5%', change: 1.8, status: '正常', date: '2024-01-15' },
  { name: '客户满意度', value: '92%', change: -2.1, status: '注意', date: '2024-01-15' },
  { name: '订单增长率', value: '15.3%', change: 8.7, status: '优秀', date: '2024-01-15' },
  { name: '退单率', value: '3.2%', change: 0.5, status: '警告', date: '2024-01-15' }
])

// 状态类型映射
const getStatusType = (status) => {
  const map = {
    '优秀': 'success',
    '良好': '',
    '正常': 'info',
    '注意': 'warning',
    '警告': 'danger'
  }
  return map[status] || ''
}

// 页面加载
onMounted(() => {
  console.log('决策看板页面加载')
  // 这里可以初始化图表
  // initCharts()
})
</script>

<style scoped>
.decision-dashboard {
  padding: 20px;
}

.dashboard-header {
  margin-bottom: 30px;
}

.page-title {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 8px;
  color: #303133;
}

.page-subtitle {
  font-size: 14px;
  color: #909399;
  margin-bottom: 0;
}

.card-row {
  margin-bottom: 20px;
}

.data-card {
  margin-bottom: 20px;
  height: 100%;
}

.card-content {
  display: flex;
  align-items: center;
}

.card-icon {
  width: 48px;
  height: 48px;
  border-radius: 12px;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-right: 16px;
  font-size: 20px;
}

.card-info {
  flex: 1;
}

.card-value {
  font-size: 24px;
  font-weight: bold;
  margin-bottom: 4px;
  color: #303133;
}

.card-label {
  font-size: 14px;
  color: #909399;
}

.chart-row {
  margin-bottom: 20px;
}

.chart-card {
  height: 100%;
  margin-bottom: 20px;
}

.chart-container {
  height: 300px;
  display: flex;
  align-items: center;
  justify-content: center;
}

.table-card {
  margin-bottom: 20px;
}

.positive {
  color: #67C23A;
  font-weight: bold;
}

.negative {
  color: #F56C6C;
  font-weight: bold;
}
</style>
