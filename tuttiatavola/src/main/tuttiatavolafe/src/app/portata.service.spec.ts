import { TestBed } from '@angular/core/testing';

import { PortataService } from './portata.service';

describe('PortataService', () => {
  let service: PortataService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PortataService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
