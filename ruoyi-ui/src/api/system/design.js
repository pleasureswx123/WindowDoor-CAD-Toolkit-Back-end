import request from '@/utils/request'

// 查询窗户设计列表
export function listDesign(query) {
  return request({
    url: '/system/design/list',
    method: 'get',
    params: query
  })
}

// 查询窗户设计详细
export function getDesign(id) {
  return request({
    url: '/system/design/' + id,
    method: 'get'
  })
}

// 新增窗户设计
export function addDesign(data) {
  return request({
    url: '/system/design',
    method: 'post',
    data: data
  })
}

// 修改窗户设计
export function updateDesign(data) {
  return request({
    url: '/system/design',
    method: 'put',
    data: data
  })
}

// 删除窗户设计
export function delDesign(id) {
  return request({
    url: '/system/design/' + id,
    method: 'delete'
  })
}

// 导出窗户设计
export function exportDesign(query) {
  return request({
    url: '/system/design/export',
    method: 'post',
    params: query
  })
}
